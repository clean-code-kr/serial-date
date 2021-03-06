package org.jfree.date.junit;

import junit.framework.TestCase;
import org.jfree.date.DayDate;
import org.jfree.date.DayDateFactory;
import org.jfree.date.Month;

import java.util.GregorianCalendar;

public class BobsDayDateFactoryTest extends TestCase {

    public void testCreateInstanceFromDDMMYYY() throws Exception {
        DayDate date = DayDateFactory.makeDate(1, Month.JANUARY, 1900);
        assertEquals(1, date.getDayOfMonth());
        assertEquals(Month.JANUARY, date.getMonth());
        assertEquals(1900, date.getYear());
        assertEquals(2, date.getOrdinalDay());
    }

    public void testCreateInstanceFromSerial() throws Exception {
        assertEquals(BobsTestUtil.d(1, Month.JANUARY, 1900), DayDateFactory.makeDate(2));
        assertEquals(BobsTestUtil.d(1, Month.JANUARY, 1901), DayDateFactory.makeDate(367));
    }

    public void testCreateInstanceFromJavaDate() throws Exception {
        assertEquals(BobsTestUtil.d(1, Month.JANUARY, 1900), DayDateFactory.makeDate(new GregorianCalendar(1900, 0, 1).getTime()));
        assertEquals(BobsTestUtil.d(1, Month.JANUARY, 2006), DayDateFactory.makeDate(new GregorianCalendar(2006, 0, 1).getTime()));
    }

}
