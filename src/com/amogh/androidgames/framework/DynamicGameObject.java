package com.amogh.androidgames.framework;

import com.amogh.androidgames.framework.math.Vector3;

public class DynamicGameObject extends GameObject3D{
	public final Vector3 velocity;
	public final Vector3 acceleration;
	
	public DynamicGameObject(float x, float y, float z, float radius){
		super(x,y,z,radius);
		velocity = new Vector3();
		acceleration = new Vector3();
	}
}
