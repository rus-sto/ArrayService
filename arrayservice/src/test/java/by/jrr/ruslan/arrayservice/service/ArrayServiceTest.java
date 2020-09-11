package by.jrr.ruslan.arrayservice.service;

import junit.framework.TestCase;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class ArrayServiceTest extends TestCase {

    int [] thisArray = {4, 8, 12, 0, 2};
    public void testCreate(){
        ArrayService arrayService = new ArrayService();
        arrayService.create(5);
    }
    public void testFillRandomly() {
        ArrayService arrayService = new ArrayService();
        int[] array = arrayService.create(10);
        arrayService.fillRandomly(thisArray);
    }
    public void testPrintArray() {
        ArrayService arrayService = new ArrayService();
        arrayService.printArray(thisArray);
    }
    public void testSum() {
        ArrayService arrayService = new ArrayService();
        assertEquals(26,arrayService.sum(thisArray));
    }
    public void testAvg() {
        ArrayService arrayService = new ArrayService();
        assertEquals(5.2,arrayService.avg(thisArray));
    }
}