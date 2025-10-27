package pij.day07.shape;

/**
 * A shape is a two-dimensional geometric object with an area and a perimeter.
 */
public interface Shape {
    /**
     * Returns the area of this Shape.
     *
     * @return the area of this Shape
     */
    double area();

    /**
     * Returns the perimeter of this Shape.
     *
     * @return the perimeter of this Shape
     */
    double perimeter();
}
