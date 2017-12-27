package Design.mode.AbstractFactoryPattern;

import Design.mode.AbstractFactoryPattern.Shape;

/**
 * Created by suchen on 2017/12/27.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
