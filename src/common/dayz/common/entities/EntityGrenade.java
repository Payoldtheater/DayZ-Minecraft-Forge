package dayz.common.entities;

import dayz.common.items.ItemGrenade;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MathHelper;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public class EntityGrenade extends EntityItem
{
    public EntityGrenade(World world)
    {
        super(world);
        setSize(0.5F, 0.5F);
        yOffset = height / 2.0F;
        bounceFactor = 0.3;
        exploded = false;
        fuse = 0;
        item = new ItemStack(Item.itemsList[ItemGrenade.grenadeID]);
    }

    public EntityGrenade(World world, Entity entity)
    {
        this(world);
        setRotation(entity.rotationYaw, 0);
        double xHeading = -MathHelper.sin((entity.rotationYaw * (float)Math.PI) / 180F);
        double zHeading = MathHelper.cos((entity.rotationYaw * (float)Math.PI) / 180F);
        motionX = 0.5 * xHeading * MathHelper.cos((entity.rotationPitch / 180F) * (float)Math.PI);
        motionY = -0.5 * MathHelper.sin((entity.rotationPitch / 180F) * (float)Math.PI);
        motionZ = 0.5 * zHeading * MathHelper.cos((entity.rotationPitch / 180F) * (float)Math.PI);
        setPosition(entity.posX + xHeading * 0.8, entity.posY, entity.posZ + zHeading * 0.8);
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
        fuse = 50;
    }
    protected boolean canTriggerWalking()
    {
        return false;
    }

    public void onUpdate()
    {
        double prevVelX = motionX;
        double prevVelY = motionY;
        double prevVelZ = motionZ;
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
        moveEntity(motionX, motionY, motionZ);

        if (motionX != prevVelX)
        {
            motionX = -bounceFactor * prevVelX;
        }

        if (motionY != prevVelY)
        {
            motionY = -bounceFactor * prevVelY;
        }
        else
        {
            motionY -= 0.04;
        }

        if (motionZ != prevVelZ)
        {
            motionZ = -bounceFactor * prevVelZ;
        }

        motionX *= 0.99;
        motionY *= 0.99;
        motionZ *= 0.99;

        if (fuse-- <= 0)
        {
            explode();
        }
    }

    private void explode()
    {
        if (!exploded)
        {
            exploded = true;
            worldObj.createExplosion(null, posX, posY, posZ, 2F);
        }
    }

    public boolean attackEntityFrom(DamageSource entity, int i)
    {
        super.attackEntityFrom(entity, i);
        explode();
        return false;
    }

    public void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeEntityToNBT(nbttagcompound);
        nbttagcompound.setByte("Fuse", (byte)fuse);
    }

    public void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readEntityFromNBT(nbttagcompound);
        fuse = nbttagcompound.getByte("Fuse");
    }

    public void onCollideWithPlayer(EntityPlayer entityplayer)
    {
    	
    }

    double bounceFactor;
    int fuse;
    boolean exploded;
}