package biz.orgin.minecraft.hothgenerator;

import java.util.List;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;

public class DagobahGenerator extends WorldGenerator
{
	public DagobahGenerator(String worldName)
	{
		super(worldName, WorldType.DAGOBAH);
	}

	@Override
	public ChunkGenerator.ChunkData generateChunkData(World world, Random random, int chunkx, int chunkz, BiomeGrid biomes)
	{
		return super.generateChunkDataDagobah(world, random, chunkx, chunkz, biomes);
	}

	@Override
	public List<BlockPopulator> getDefaultPopulators(World world)
	{
		return super.getDefaultPopulators(world);
	}

	@Override
	public Location getFixedSpawnLocation(World world, Random random)
	{
		return super.getFixedSpawnLocation(world, random);
	}
}
