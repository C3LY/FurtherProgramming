/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cy214
 */
public class Sterling {
    private int value;
    public Sterling(int i){
            this.value = i;
        }

    public int getValue() {
        return value;
    }

    public Sterling addToValue(Sterling s1) {
        return new Sterling(this.value += s1.getValue());
    }

    public Sterling changeByPercentage(double d) {
        return new Sterling((int) (this.value*d/100));
    }
    
    public Sterling multiplyBy(int v){
        return new Sterling(getValue()*v);
    }

    
    
}
