package co.edu.javeriana.car;

import processing.core.PApplet;
import processing.core.PImage;

import com.nootropic.processing.layers.Layer;

class InternalCar extends Layer implements Car {
	private float angle = 0;
	private float x = 0;
	
	private class ColorData {
		public float r;
		public float g;
		public float b;
		public float a;
	}

	ColorData cd = new ColorData();
	
	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	private float y = 0;
	PImage carSprite;

	private float prevX;
	private float prevY;

	public InternalCar(PApplet parent, PImage sprite) {
		super(parent);
		carSprite = sprite;
	}

	public void setPos(float x, float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void right(float dAngle) {
		angle += dAngle / 180 * Math.PI;
	}

	@Override
	public void left(float dAngle) {
		angle -= dAngle / 180 * Math.PI;
	}

	@Override
	public void forward(float steps) {
		prevX = x;
		prevY = y;
		x = PApplet.constrain(x + steps * (float) Math.cos(angle), 0, parent.getWidth());
		y = PApplet.constrain(y + steps * (float) Math.sin(angle), 0, parent.getHeight());
		parent.stroke(cd.r, cd.g, cd.b, cd.a);
		parent.line(prevX, prevY, x, y);
	}

	@Override
	public void back(float steps) {
		forward(-steps);
	}

	@Override
	public void color(float r, float g, float b, float a) {
		cd.r = r;
		cd.g = g;
		cd.b = b;
		cd.a = a;
	}

	@Override
	public void draw() {
		background(0, 0);
		deletePrevious();
		rotate(angle);
		image(carSprite, -carSprite.width / 2, -carSprite.height / 2);
	}

	private void deletePrevious() {
		stroke(0,0);
		fill(0,0);
		 translate(prevX, prevY);
		 rect(- carSprite.width / 2, - carSprite.height / 2,
		 carSprite.width, carSprite.height);
		 translate(x-prevX, y-prevY);
		
	}

}
