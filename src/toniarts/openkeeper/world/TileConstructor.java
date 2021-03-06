/*
 * Copyright (C) 2014-2015 OpenKeeper
 *
 * OpenKeeper is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenKeeper is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenKeeper.  If not, see <http://www.gnu.org/licenses/>.
 */
package toniarts.openkeeper.world;

import com.jme3.asset.AssetManager;
import com.jme3.scene.Spatial;
import toniarts.openkeeper.tools.convert.map.KwdFile;
import toniarts.openkeeper.tools.convert.map.Terrain;

/**
 *
 * @author ArchDemon
 */

abstract class TileConstructor {
    protected final KwdFile kwdFile;

    public TileConstructor(KwdFile kwdFile) {
        this.kwdFile = kwdFile;
    }

    /**
     * Compares the given terrain tile to terrain tile at the given coordinates
     *
     * @param tiles the tiles
     * @param x the x
     * @param y the y
     * @param terrain terrain tile to compare with
     * @return are the tiles same
     */
    protected boolean hasSameTile(MapData mapData, int x, int y, Terrain terrain) {

        // Check for out of bounds
        TileData tile = mapData.getTile(x, y);
        if (tile == null) {
            return false;
        }
        Terrain bridgeTerrain = kwdFile.getTerrainBridge(tile.getFlag(), tile.getTerrain());
        return (tile.getTerrainId() == terrain.getTerrainId() || (bridgeTerrain != null && bridgeTerrain.getTerrainId() == terrain.getTerrainId()));
    }

    protected boolean isSolidTile(MapData mapData, int x, int y) {
        TileData tile = mapData.getTile(x, y);
        if (tile == null) {
            return false;
        }
        return tile.getTerrain().getFlags().contains(Terrain.TerrainFlag.SOLID);
    }

    abstract public Spatial construct(MapData mapData, int x, int y, final Terrain terrain, final AssetManager assetManager, String model);
}
