/*
 * Copyright (c) 2015.
 *
 * Xiaobing(Ben) Yu (xiaobingbenyu@gmail.com)
 */

package AbstractFactoryPatterns;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}