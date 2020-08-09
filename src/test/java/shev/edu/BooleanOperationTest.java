
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

import org.junit.Test;

import static org.junit.Assert.*;

public class BooleanOperationTest {

    Boolean result;

//Tests
    @Test
    public void whenFirstTrueSecondTrueConjunctionTrue(){
        assertEquals(true, result = new BooleanOperation(true, true).conjunction());
    }


    @org.testng.annotations.Test
    public void whenFirstTrueSecondFalseConjunctionFalse() {
        assertEquals(false, result = new BooleanOperation(true, false).conjunction()
        );
    }

    @Test
    public void whenFirstTrueSecondNullConjunctionNull() {
        assertEquals(null, result = new BooleanOperation(true, null).conjunction()
        );
    }


    @Test
    public void whenFirstFalseSecondTrueConjunctionFalse() {
        assertEquals(false, result = new BooleanOperation(false, true).conjunction()
        );
    }

    @Test
    public void whenFirstFalseSecondFalseConjunctionFalse() {
        assertEquals(false, result = new BooleanOperation(false, false).conjunction()
        );
    }

    @Test
    public void whenFirstFalseSecondNullConjunctionNull() {
        assertEquals(null, result = new BooleanOperation(false, null).conjunction()
        );
    }

    @Test
    public void whenFirstNullSecondTrueConjunctionNull() {
        assertEquals(null, result = new BooleanOperation(null, true).conjunction()
        );
    }

    @Test
    public void whenFirstNullSecondFalseConjunctionNull() {
        assertEquals(null, result = new BooleanOperation(null, false).conjunction()
        );
    }

    @Test
    public void whenFirstNullSecondNullConjunctionNull() {
        assertEquals(null, result = new BooleanOperation(null, null).conjunction()
        );
    }


    @Test
    public void whenFirstTrueSecondTrueDisjunctionTrue() {
        assertEquals(true, result = new BooleanOperation(true, true).disjunction()
        );
    }

    @Test
    public void whenFirstTrueSecondFalseDisjunctionTrue() {
        assertEquals(true, result = new BooleanOperation(true, false).disjunction()
        );
    }

    @Test
    public void whenFirstTrueSecondNullDisjunctionTrue() {
        assertEquals(true, result = new BooleanOperation(true, null).disjunction()
        );
    }


    @Test
    public void whenFirstFalseSecondTrueDisjunctionTrue() {
        assertEquals(true, result = new BooleanOperation(false, true).disjunction()
        );
    }

    @Test
    public void whenFirstFalseSecondFalseDisjunctionFalse() {
        assertEquals(false, result = new BooleanOperation(false, false).disjunction()
        );
    }

    @Test
    public void whenFirstFalseSecondNullDisjunctionFalse() {
        assertEquals(false, result = new BooleanOperation(false, null).disjunction()
        );
    }


    @Test
    public void whenFirstNullSecondTrueDisjunctionTrue() {
        assertEquals(true, result = new BooleanOperation(null, true).disjunction()
        );
    }

    @Test
    public void whenFirstNullSecondFalseDisjunctionFalse() {
        assertEquals(false, result = new BooleanOperation(null, false).disjunction()
        );
    }

    @Test
    public void whenFirstNullSecondNullDisjunctionNull() {
        assertEquals(null, result = new BooleanOperation(null, null).disjunction()
        );
    }
}
