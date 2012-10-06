package dayz.common.world;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.TileEntityChest;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenerator;
import dayz.common.DayZ;
import dayz.common.DayZLog;
import dayz.common.Util;

public class WorldGenFort extends WorldGenerator
{
    public WorldGenFort()
    {
    	
    }
    
    private Random rand;
    public int chestcontents;
    int randomstonebrick = 0;
    
    public boolean generate(World world, Random rand, int i, int j, int k)
    {
        int bID = 2;

        if (world.getBlockId(i, j, k) != bID || world.getBlockId(i, j + 1, k) != 0 || world.getBlockId(i + 7, j, k) != bID || world.getBlockId(i + 7, j, k + 7) != bID || world.getBlockId(i, j, k + 7) != bID || world.getBlockId(i + 7, j + 1, k) != 0 || world.getBlockId(i + 7, j + 1, k + 7) != 0 || world.getBlockId(i, j + 1, k + 7) != 0)
        {
            return false;
        }

        world.setBlockAndMetadataWithNotify(i + 1, j + 0, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 0, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 0, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 0, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 0, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 0, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 0, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 0, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 0, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 0, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 0, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 0, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 0, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 0, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 0, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 0, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 0, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 0, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 0, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 0, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 0, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 0, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 0, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 0, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 0, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 1, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 1, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 1, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 1, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 1, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 1, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 1, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 1, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 1, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 1, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 1, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 1, k + 4, 98, randomstonebrick);
        world.setBlock(i + 3, j + 1, k + 3, 0);
        world.setBlockAndMetadataWithNotify(i + 3, j + 1, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 1, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 1, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 1, k + 4, 44, 5);
        world.setBlock(i + 4, j + 1, k + 3, 0);
        world.setBlockAndMetadataWithNotify(i + 4, j + 1, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 1, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 1, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 1, k + 4, 98, randomstonebrick);
        boolean flag2 = false;
        int doorstate = 0;
        world.setBlockAndMetadataWithNotify(i + 5, j + 1, k + 3, Block.doorWood.blockID, doorstate);
        world.setBlockAndMetadataWithNotify(i + 5, j + 2, k + 3, Block.doorWood.blockID, 8 | (flag2 ? 1 : doorstate));
        world.setBlockAndMetadataWithNotify(i + 5, j + 1, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 1, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 2, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 2, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 2, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 2, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 2, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 2, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 2, k + 4, 44, 5);
        world.setBlockAndMetadataWithNotify(i + 2, j + 2, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 2, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 2, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 2, k + 5, 98, randomstonebrick);
        world.setBlock(i + 3, j + 2, k + 4, 0);
        world.setBlock(i + 3, j + 2, k + 3, 0);
        world.setBlockAndMetadataWithNotify(i + 3, j + 2, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 2, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 2, k + 5, 98, randomstonebrick);
        world.setBlock(i + 4, j + 2, k + 4, 0);
        world.setBlock(i + 4, j + 2, k + 3, 0);
        world.setBlockAndMetadataWithNotify(i + 4, j + 2, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 2, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 2, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 2, k + 4, 98, randomstonebrick);
        //world.setBlock(i + 5, j + 2, k + 3, 64);//
        world.setBlockAndMetadataWithNotify(i + 5, j + 2, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 2, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 3, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 3, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 3, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 3, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 3, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 3, k + 5, 98, randomstonebrick);
        world.setBlock(i + 2, j + 3, k + 4, 0);
        world.setBlock(i + 2, j + 3, k + 3, 0);
        world.setBlockAndMetadataWithNotify(i + 2, j + 3, k + 2, 44, 5);
        world.setBlockAndMetadataWithNotify(i + 2, j + 3, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 3, k + 5, 98, randomstonebrick);
        world.setBlock(i + 3, j + 3, k + 4, 0);
        world.setBlock(i + 3, j + 3, k + 3, 0);
        world.setBlockAndMetadataWithNotify(i + 3, j + 3, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 3, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 3, k + 5, 98, randomstonebrick);
        world.setBlock(i + 4, j + 3, k + 4, 0);
        world.setBlock(i + 4, j + 3, k + 3, 0);
        world.setBlockAndMetadataWithNotify(i + 4, j + 3, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 3, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 3, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 3, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 3, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 3, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 3, k + 1, 98, randomstonebrick);
        world.setBlockWithNotify(i + 0, j + 4, k + 3, 50);
        world.setBlockAndMetadataWithNotify(i + 1, j + 4, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 4, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 4, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 4, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 4, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 4, k + 5, 98, randomstonebrick);
        world.setBlock(i + 2, j + 4, k + 4, 0);
        world.setBlockWithNotify(i + 2, j + 4, k + 3, 50);
        world.setBlock(i + 2, j + 4, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 2, j + 4, k + 1, 98, randomstonebrick);
        world.setBlockWithNotify(i + 3, j + 4, k + 6, 50);
        world.setBlockAndMetadataWithNotify(i + 3, j + 4, k + 5, 98, randomstonebrick);
        world.setBlock(i + 3, j + 4, k + 4, 0);
        world.setBlock(i + 3, j + 4, k + 3, 0);
        world.setBlock(i + 3, j + 4, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 3, j + 4, k + 1, 98, randomstonebrick);
        world.setBlockWithNotify(i + 3, j + 4, k + 0, 50);
        world.setBlockAndMetadataWithNotify(i + 4, j + 4, k + 5, 98, randomstonebrick);
        world.setBlock(i + 4, j + 4, k + 4, 0);
        world.setBlockAndMetadataWithNotify(i + 4, j + 4, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 4, k + 2, 44, 5);
        world.setBlockAndMetadataWithNotify(i + 4, j + 4, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 4, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 4, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 4, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 4, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 4, k + 1, 98, randomstonebrick);
        world.setBlockWithNotify(i + 6, j + 4, k + 3, 50);
        world.setBlockAndMetadataWithNotify(i + 1, j + 5, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 5, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 5, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 5, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 5, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 5, k + 5, 98, randomstonebrick);
        world.setBlock(i + 2, j + 5, k + 4, 0);
        world.setBlock(i + 2, j + 5, k + 3, 0);
        world.setBlock(i + 2, j + 5, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 2, j + 5, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 5, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 5, k + 4, 98, randomstonebrick);
        world.setBlock(i + 3, j + 5, k + 3, 0);
        world.setBlock(i + 3, j + 5, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 3, j + 5, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 5, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 5, k + 4, 44, 5);
        world.setBlock(i + 4, j + 5, k + 3, 0);
        world.setBlock(i + 4, j + 5, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 4, j + 5, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 5, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 5, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 5, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 5, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 5, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 6, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 6, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 6, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 6, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 6, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 6, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 6, k + 4, 44, 5);
        world.setBlockAndMetadataWithNotify(i + 2, j + 6, k + 3, 98, randomstonebrick);
        world.setBlock(i + 2, j + 6, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 2, j + 6, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 6, k + 5, 98, randomstonebrick);
        world.setBlock(i + 3, j + 6, k + 4, 0);
        world.setBlock(i + 3, j + 6, k + 3, 0);
        world.setBlock(i + 3, j + 6, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 3, j + 6, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 6, k + 5, 98, randomstonebrick);
        world.setBlock(i + 4, j + 6, k + 4, 0);
        world.setBlockWithNotify(i + 4, j + 6, k + 3, 50);
        world.setBlock(i + 4, j + 6, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 4, j + 6, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 6, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 6, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 6, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 6, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 6, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 7, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 7, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 7, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 7, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 7, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 7, k + 5, 98, randomstonebrick);
        world.setBlock(i + 2, j + 7, k + 4, 0);
        world.setBlock(i + 2, j + 7, k + 3, 0);
        world.setBlockAndMetadataWithNotify(i + 2, j + 7, k + 2, 44, 5);
        world.setBlockAndMetadataWithNotify(i + 2, j + 7, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 7, k + 5, 98, randomstonebrick);
        world.setBlock(i + 3, j + 7, k + 4, 0);
        world.setBlock(i + 3, j + 7, k + 3, 0);
        world.setBlockAndMetadataWithNotify(i + 3, j + 7, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 7, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 7, k + 5, 98, randomstonebrick);
        world.setBlock(i + 4, j + 7, k + 4, 0);
        world.setBlock(i + 4, j + 7, k + 3, 0);
        world.setBlock(i + 4, j + 7, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 4, j + 7, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 7, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 7, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 7, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 7, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 7, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 8, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 8, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 8, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 8, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 8, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 8, k + 5, 98, randomstonebrick);
        world.setBlock(i + 2, j + 8, k + 4, 0);
        world.setBlockWithNotify(i + 2, j + 8, k + 3, 50);
        world.setBlock(i + 2, j + 8, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 2, j + 8, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 8, k + 5, 98, randomstonebrick);
        world.setBlock(i + 3, j + 8, k + 4, 0);
        world.setBlock(i + 3, j + 8, k + 3, 0);
        world.setBlock(i + 3, j + 8, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 3, j + 8, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 8, k + 5, 98, randomstonebrick);
        world.setBlock(i + 4, j + 8, k + 4, 0);
        world.setBlockAndMetadataWithNotify(i + 4, j + 8, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 8, k + 2, 44, 5);
        world.setBlockAndMetadataWithNotify(i + 4, j + 8, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 8, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 8, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 8, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 8, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 8, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 9, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 9, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 9, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 9, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 9, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 9, k + 5, 98, randomstonebrick);
        world.setBlock(i + 2, j + 9, k + 4, 0);
        world.setBlock(i + 2, j + 9, k + 3, 0);
        world.setBlock(i + 2, j + 9, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 2, j + 9, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 9, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 9, k + 4, 98, randomstonebrick);
        world.setBlock(i + 3, j + 9, k + 3, 0);
        world.setBlock(i + 3, j + 9, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 3, j + 9, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 9, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 9, k + 4, 44, 5);
        world.setBlock(i + 4, j + 9, k + 3, 0);
        world.setBlock(i + 4, j + 9, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 4, j + 9, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 9, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 9, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 9, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 9, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 9, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 0, j + 10, k + 6, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 0, j + 10, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 0, j + 10, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 0, j + 10, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 0, j + 10, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 0, j + 10, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 0, j + 10, k + 0, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 10, k + 6, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 10, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 10, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 10, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 10, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 10, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 1, j + 10, k + 0, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 10, k + 6, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 10, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 10, k + 4, 44, 5);
        world.setBlockAndMetadataWithNotify(i + 2, j + 10, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 10, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 10, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 2, j + 10, k + 0, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 10, k + 6, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 10, k + 5, 98, randomstonebrick);
        world.setBlock(i + 3, j + 10, k + 4, 0);
        world.setBlock(i + 3, j + 10, k + 3, 0);
        world.setBlock(i + 3, j + 10, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 3, j + 10, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 3, j + 10, k + 0, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 10, k + 6, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 10, k + 5, 98, randomstonebrick);
        world.setBlock(i + 4, j + 10, k + 4, 0);
        world.setBlock(i + 4, j + 10, k + 3, 0);
        world.setBlock(i + 4, j + 10, k + 2, 0);
        world.setBlockAndMetadataWithNotify(i + 4, j + 10, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 4, j + 10, k + 0, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 10, k + 6, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 10, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 10, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 10, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 10, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 10, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 5, j + 10, k + 0, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 6, j + 10, k + 6, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 6, j + 10, k + 5, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 6, j + 10, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 6, j + 10, k + 3, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 6, j + 10, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 6, j + 10, k + 1, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 6, j + 10, k + 0, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 0, j + 11, k + 6, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 0, j + 11, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 0, j + 11, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 0, j + 11, k + 0, 98, randomstonebrick);
        world.setBlock(i + 1, j + 11, k + 5, 0);
        world.setBlock(i + 1, j + 11, k + 4, 0);
        world.setBlock(i + 1, j + 11, k + 3, 0);
        world.setBlock(i + 1, j + 11, k + 2, 0);
        world.setBlock(i + 1, j + 11, k + 1, 0);
        world.setBlockAndMetadataWithNotify(i + 2, j + 11, k + 6, 98, randomstonebrick);
        world.setBlock(i + 2, j + 11, k + 5, 0);
        world.setBlock(i + 2, j + 11, k + 4, 0);
        world.setBlock(i + 2, j + 11, k + 3, 0);
        world.setBlock(i + 2, j + 11, k + 2, 0);
        world.setBlock(i + 2, j + 11, k + 1, 0);
        world.setBlockAndMetadataWithNotify(i + 2, j + 11, k + 0, 98, randomstonebrick);
        world.setBlock(i + 3, j + 11, k + 5, 0);
        world.setBlock(i + 3, j + 11, k + 4, 0);
        world.setBlock(i + 3, j + 11, k + 3, 0);
        world.setBlock(i + 3, j + 11, k + 2, 0);
        world.setBlock(i + 3, j + 11, k + 1, 0);
        world.setBlockAndMetadataWithNotify(i + 4, j + 11, k + 6, 98, randomstonebrick);
        world.setBlock(i + 4, j + 11, k + 5, 0);
        world.setBlock(i + 4, j + 11, k + 4, 0);
        world.setBlock(i + 4, j + 11, k + 3, 0);
        world.setBlock(i + 4, j + 11, k + 2, 0);
        world.setBlock(i + 4, j + 11, k + 1, 0);
        world.setBlockAndMetadataWithNotify(i + 4, j + 11, k + 0, 98, randomstonebrick);
        
        int chest = DayZ.dayzchestrare.blockID;
        int lootType = rand.nextInt(4);
        int itemlocation = rand.nextInt(27);
        int numofcontents = rand.nextInt(10);
        
        world.setBlockWithNotify(i + 5, j + 11, k + 5, chest);
        TileEntityChest tileentitychest = (TileEntityChest)world.getBlockTileEntity(i + 5, j + 11, k + 5);
        DayZLog.info("Day Z Fort Chest Created At " + (i + 5) + ", " + (j + 11) + ", " + (k + 5) + ".");

        
        if(numofcontents < 1)
        {
        	chestcontents = 5;
        }
        else if(numofcontents >= 1 && numofcontents <= 5)
        {
        	chestcontents = 3;
        }
        else if(numofcontents > 5)
        {
        	chestcontents = 1;
        }
        for (int n = 0; n < chestcontents; n++)
        {
            if (lootType == 1)
            {
                ItemStack itemstack = Util.LootItemsRare();

                if (itemstack != null)
                {
                	tileentitychest.setInventorySlotContents(rand.nextInt(tileentitychest.getSizeInventory()), itemstack);
                }
            }
            else
            {
                ItemStack itemstack = Util.LootItemsCommon();

                if (itemstack != null)
                {
                	tileentitychest.setInventorySlotContents(rand.nextInt(tileentitychest.getSizeInventory()), itemstack);
                }
            }
        }
        world.setBlock(i + 5, j + 11, k + 4, 0);
        world.setBlock(i + 5, j + 11, k + 3, 0);
        world.setBlock(i + 5, j + 11, k + 2, 0);
        world.setBlock(i + 5, j + 11, k + 1, 0);
        world.setBlockAndMetadataWithNotify(i + 6, j + 11, k + 6, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 6, j + 11, k + 4, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 6, j + 11, k + 2, 98, randomstonebrick);
        world.setBlockAndMetadataWithNotify(i + 6, j + 11, k + 0, 98, randomstonebrick);
        world.setBlockWithNotify(i + 0, j + 12, k + 6, 50);
        world.setBlockWithNotify(i + 0, j + 12, k + 4, 50);
        world.setBlockWithNotify(i + 0, j + 12, k + 2, 50);
        world.setBlockWithNotify(i + 0, j + 12, k + 0, 50);
        world.setBlockWithNotify(i + 2, j + 12, k + 6, 50);
        world.setBlockWithNotify(i + 2, j + 12, k + 0, 50);
        world.setBlockWithNotify(i + 4, j + 12, k + 6, 50);
        world.setBlockWithNotify(i + 4, j + 12, k + 0, 50);
        world.setBlockWithNotify(i + 6, j + 12, k + 6, 50);
        world.setBlockWithNotify(i + 6, j + 12, k + 4, 50);
        world.setBlockWithNotify(i + 6, j + 12, k + 2, 50);
        world.setBlockWithNotify(i + 6, j + 12, k + 0, 50);
        return true;
    }
}