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
package toniarts.openkeeper.tools.convert.kcs;

import javax.vecmath.Vector3f;

/**
 * Stores the KCS file entry structure<br>
 * From guide by George Gensure
 *
 * @author Toni Helenius <helenius.toni@gmail.com>
 */
public class KcsEntry {

    private Vector3f position;
    private Vector3f direction;
    private Vector3f left;
    private Vector3f up;
    private float fov;
    private float near;

    public Vector3f getPosition() {
        return position;
    }

    protected void setPosition(Vector3f position) {
        this.position = position;
    }

    /**
     * Forward orientation vector
     *
     * @return Forward orientation
     */
    public Vector3f getDirection() {
        return direction;
    }

    protected void setDirection(Vector3f direction) {
        this.direction = direction;
    }

    /**
     * Left orientation vector
     *
     * @return Left orientation
     */
    public Vector3f getLeft() {
        return left;
    }

    protected void setLeft(Vector3f left) {
        this.left = left;
    }

    /**
     * Up orientation vector
     *
     * @return Up orientation
     */
    public Vector3f getUp() {
        return up;
    }

    protected void setUp(Vector3f up) {
        this.up = up;
    }

    /**
     * Field of view (in radians)
     *
     * @return Field of view
     */
    public float getFov() {
        return fov;
    }

    protected void setFov(float fov) {
        this.fov = fov;
    }

    /**
     * Near clipping distance in fixed units
     *
     * @return Near clipping distance
     */
    public float getNear() {
        return near;
    }

    protected void setNear(float near) {
        this.near = near;
    }
}
