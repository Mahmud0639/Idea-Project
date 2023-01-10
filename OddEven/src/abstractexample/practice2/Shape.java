package abstractexample.practice2;

public abstract class Shape {
    double dim1, dim2;
    Shape(double dim1,double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    Shape(double r){
        this.dim1 = r;
    }
    abstract void areaCount();
}
