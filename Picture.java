/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Nicole Burke
 * @version 2022.31.01
 */
public class Picture
{
    private Circle leftEar;
    private Circle rightEar;
    private Circle leftEye;
    private Circle rightEye;
    private Circle leftPupil;
    private Circle rightPupil;
    private Circle lEyeShine;
    private Circle rEyeShine;
    private Square lEyelid;
    private Square rEyelid;
    private Triangle head;
    private Person nose;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        leftEar = new Circle();
        rightEar = new Circle();
        leftEye = new Circle();
        rightEye = new Circle();
        leftPupil = new Circle();
        rightPupil = new Circle();
        lEyeShine = new Circle();
        rEyeShine = new Circle();
        lEyelid = new Square();
        rEyelid = new Square();  
        head = new Triangle();
        nose = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            leftEar.changeColor("black");
            leftEar.moveHorizontal(-80);
            leftEar.moveVertical(-60);
            leftEar.changeSize(100);
            leftEar.makeVisible();
            
            rightEar.changeColor("black");
            rightEar.moveHorizontal(20);
            rightEar.moveVertical(-60);
            rightEar.changeSize(100);
            rightEar.makeVisible();
            
            head.changeColor("black");
            head.changeSize(-150,125);
            head.moveHorizontal(40);
            head.moveVertical(100);
            head.makeVisible();
            
            nose.changeColor("black");
            nose.changeSize(-50,100);
            nose.moveHorizontal(-29);
            nose.moveVertical(41);
            nose.makeVisible();
            
            leftEye.changeColor("yellow");
            leftEye.moveHorizontal(-15);
            leftEye.moveVertical(40);
            leftEye.changeSize(35);
            leftEye.makeVisible();
            
            rightEye.changeColor("yellow");
            rightEye.moveHorizontal(20);
            rightEye.moveVertical(40);
            rightEye.changeSize(35);
            rightEye.makeVisible();
            
            leftPupil.changeColor("red");
            leftPupil.moveHorizontal(-10);
            leftPupil.moveVertical(43);
            leftPupil.changeSize(25);
            leftPupil.makeVisible();
            
            rightPupil.changeColor("red");
            rightPupil.moveHorizontal(25);
            rightPupil.moveVertical(43);
            rightPupil.changeSize(25);
            rightPupil.makeVisible();
            
            lEyeShine.changeColor("magenta");
            lEyeShine.moveHorizontal(6);
            lEyeShine.moveVertical(55);
            lEyeShine.changeSize(10);
            lEyeShine.makeVisible();
            
            rEyeShine.changeColor("magenta");
            rEyeShine.moveHorizontal(40);
            rEyeShine.moveVertical(55);
            rEyeShine.changeSize(10);
            rEyeShine.makeVisible();
            
            lEyelid.changeColor("black");
            lEyelid.moveHorizontal(-95);
            lEyelid.moveVertical(-15);
            lEyelid.changeSize(45);
            lEyelid.makeVisible();
            
            rEyelid.changeColor("black");
            rEyelid.moveHorizontal(-68);
            rEyelid.moveVertical(-15);
            rEyelid.changeSize(45);
            rEyelid.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        leftEar.changeColor("black");
        rightEar.changeColor("black");
        head.changeColor("black");
        nose.changeColor("black");
        leftEye.changeColor("white");
        rightEye.changeColor("white");
        leftPupil.changeColor("black");
        rightPupil.changeColor("black");
        lEyeShine.changeColor("white");
        rEyeShine.changeColor("white");
        lEyelid.changeColor("black");
        rEyelid.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        leftEar.changeColor("black");
        rightEar.changeColor("black");
        head.changeColor("black");
        nose.changeColor("black");
        leftEye.changeColor("yellow");
        rightEye.changeColor("yellow");
        leftPupil.changeColor("red");
        rightPupil.changeColor("red");
        lEyeShine.changeColor("magenta");
        rEyeShine.changeColor("magenta");
        lEyelid.changeColor("black");
        rEyelid.changeColor("black");
    }
}
