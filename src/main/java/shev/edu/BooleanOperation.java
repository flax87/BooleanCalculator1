/*
 * Class name :  BooleanService
 *
 * @author Oleksii Shevchenko
 *
 * Description:
 *
 * Create boolean operation
 *
 */

package shev.edu;

import java.util.logging.Logger;

public class BooleanOperation{

    //params
    private Boolean firstOne;
    private Boolean secondOne;

    //Logger to log
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    //constructor
    public BooleanOperation(Boolean firstOne, Boolean secondOne){
        this.firstOne = firstOne;
        this.secondOne = secondOne;


    }
    //Methods conjunction operation
    public Boolean conjunction(){
        LOGGER.info("Started conjunction operation");
        if (this.firstOne == null || this.secondOne == null) return null;
        return this.firstOne && this.secondOne;
    }

    public Boolean disjunction() {
        LOGGER.info("Started disjunction operation");
        if (this.firstOne == null && this.secondOne == null) return null;
        if (this.firstOne == null) return secondOne;
        if (this.secondOne == null) return firstOne;
        return this.firstOne || this.secondOne;
    }


}
