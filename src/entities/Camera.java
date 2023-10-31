package entities;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.util.vector.Vector3f;

public class Camera {
    private Vector3f position = new Vector3f(0,4,0);
    private float pitch = 15;
    private float yaw= 90;
    private float roll;

    public Camera(){}

    public void move(){
//        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)){
//            if (Keyboard.isKeyDown(Keyboard.KEY_S)){
//                position.z-=0.5f;
//            }
//            if (Keyboard.isKeyDown(Keyboard.KEY_W)){
//                position.z+=0.5f;
//            }
//            if (Keyboard.isKeyDown(Keyboard.KEY_A)){
//                position.x+=0.5f;
//            }
//            if (Keyboard.isKeyDown(Keyboard.KEY_D)){
//                position.x-=0.5f;
//            }
            if (Keyboard.isKeyDown(Keyboard.KEY_R)){
                position.y+=0.5f;
            }
            if (Keyboard.isKeyDown(Keyboard.KEY_F)){
                position.y-=0.5f;
            }
            if (Keyboard.isKeyDown(Keyboard.KEY_E)){
                yaw-=1.0f;
            }if (Keyboard.isKeyDown(Keyboard.KEY_Q)){
                yaw+=1.0f;
            }
//        }else {
//
//        }
    }

    public Vector3f getPosition() {
        return position;
    }

    public float getPitch() {
        return pitch;
    }

    public float getYaw() {
        return yaw;
    }

    public float getRoll() {
        return roll;
    }
}
