package com.github.hexosse.wecuife.render.region;

import com.github.hexosse.wecuife.render.LineColour;
import com.github.hexosse.wecuife.render.points.PointCube;
import com.github.hexosse.wecuife.render.shapes.RenderEllipsoid;
import com.github.hexosse.wecuife.util.Vector3;

/**
 * Main controller for a ellipsoid-type region
 * 
 * @author yetanotherx
 * @author lahwran
 */
public class EllipsoidRegion extends BaseRegion
{
	
	protected PointCube centre;
	protected Vector3 radii;
	
	private RenderEllipsoid ellipsoid;
	
	public EllipsoidRegion()
	{
		super();
	}
	
	@Override
	public void render(Vector3 cameraPos)
	{
		if (this.centre != null && this.radii != null)
		{
			this.centre.render(cameraPos);
			this.ellipsoid.render(cameraPos);
		}
		else if (this.centre != null)
		{
			this.centre.render(cameraPos);
		}
	}
	
	@Override
	public void setEllipsoidCenter(int x, int y, int z)
	{
		this.centre = new PointCube(x, y, z);
		this.centre.setColour(LineColour.ELLIPSOIDCENTRE);
		this.update();
	}
	
	@Override
	public void setEllipsoidRadii(double x, double y, double z)
	{
		this.radii = new Vector3(x, y, z);
		this.update();
	}

	private void update()
	{
		if (this.centre != null && this.radii != null)
		{
			this.ellipsoid = new RenderEllipsoid(LineColour.ELLIPSOIDGRID, this.centre, this.radii);
		}
	}
	
	@Override
	public RegionType getType()
	{
		return RegionType.ELLIPSOID;
	}
	
}
