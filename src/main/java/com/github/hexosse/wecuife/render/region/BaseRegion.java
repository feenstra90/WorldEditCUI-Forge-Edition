package com.github.hexosse.wecuife.render.region;

import com.github.hexosse.wecuife.util.Vector3;

/**
 * Base region storage class. Provides
 * abstract methods for setting various
 * points in the region. 
 * 
 * @author yetanotherx
 * @author lahwran
 */
public abstract class BaseRegion
{
	public BaseRegion()
	{
	}

	public void initialise()
	{
	}
	
	public abstract void render(Vector3 cameraPos);
	
	public void setCuboidPoint(int id, double x, double y, double z)
	{
		//throw new InvalidSelectionTypeException(this.getType().getName(), "setCuboidPoint");
	}
	
	public void setPolygonPoint(int id, int x, int z)
	{
		//throw new InvalidSelectionTypeException(this.getType().getName(), "setPolygonPoint");
	}
	
	public void setEllipsoidCenter(int x, int y, int z)
	{
		//throw new InvalidSelectionTypeException(this.getType().getName(), "setEllipsoidCenter");
	}
	
	public void setEllipsoidRadii(double x, double y, double z)
	{
		//throw new InvalidSelectionTypeException(this.getType().getName(), "setEllipsoidRadii");
	}
	
	public void setMinMax(int min, int max)
	{
		//throw new InvalidSelectionTypeException(this.getType().getName(), "setMinMax");
	}
	
	public void setCylinderCenter(int x, int y, int z)
	{
		//throw new InvalidSelectionTypeException(this.getType().getName(), "setCylinderCenter");
	}
	
	public void setCylinderRadius(double x, double z)
	{
		//throw new InvalidSelectionTypeException(this.getType().getName(), "setCylinderRadius");
	}
	
	public void addPolygon(int[] vertexIds)
	{
		//throw new InvalidSelectionTypeException(this.getType().getName(), "addPolygon");
	}
	
	public abstract RegionType getType();
}
