package net.fabricmc.sobaboii;

import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class Mod implements ModInitializer
{
    public static final Logger DEBUG = LoggerFactory.getLogger("sobaboii");

    public static HashSet<Edible> edibles;

    @Override
    public void onInitialize()
    {
        DEBUG.info("[SOBA]: Hello World from Mod Init!");
        edibles = new HashSet<Edible>();
        edibles.add(new Edible("soba_noodles", 4.0));
        edibles.add(new Edible("rhubarb_crumble", 4.0));
        edibles.add(new Edible("raspberry_pie", 4.0));
        edibles.add(new Edible("buckwheat", -1.0));
        edibles.add(new Edible("polygonum", -1.0));
        edibles.add(new Edible("rhubarb", -1.0));
        edibles.add(new Edible("raspberry", 3.14));
        edibles.add(new Edible("cherry", 2.5));
    }
}