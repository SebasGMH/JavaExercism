import java.util.List;
import java.util.ArrayList;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        // will ue bit comparison to check wich actions will be acted
        /*
            00001 = 1
            00010 = 2
            00100 = 4
            01000 = 8
            10000 = 16
         */
        // will check first bit to determine if should start at left or right

        List<Signal> secret = new ArrayList<>();

        // 10000
        if ((number & 16) != 0){ 
            // reversed

            if ((number & 8) != 0){
                secret.add(Signal.JUMP);
            }

            if ((number & 4) != 0){
                secret.add(Signal.CLOSE_YOUR_EYES);
            }

            if ((number & 2) != 0){
                secret.add(Signal.DOUBLE_BLINK);
            }

            if ((number & 1) != 0){
                secret.add(Signal.WINK);
            }

            return secret;
        }

        else{

            if ((number & 1) != 0){
                secret.add(Signal.WINK);
            }

            if ((number & 2) != 0){
                secret.add(Signal.DOUBLE_BLINK);
            }

            if ((number & 4) != 0){
                secret.add(Signal.CLOSE_YOUR_EYES);
            }

            if ((number & 8) != 0){
                secret.add(Signal.JUMP);
            }

            return secret;

        }
    }

}
