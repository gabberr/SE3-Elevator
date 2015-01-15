package at.fhhagenberg.sqe.elevator.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sqelevator.IElevator;
import at.fhhagenberg.sqe.elevator.model.Elevator;

public class ElevatorMockTest {
    private static Elevator m_adapter = null;
    private ElevatorMock m_mock = null;

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        m_adapter = new Elevator();
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        m_adapter = null;
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        m_mock = new ElevatorMock();
       // m_adapter.setIElevatorRef(m_mock);
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        m_mock = null;
    }

    @Test
    public void testGetCommittedDirection(){
        assertEquals(IElevator.ELEVATOR_DIRECTION_UP, m_adapter.getCommittedDirection(1));
		assertEquals(IElevator.ELEVATOR_DIRECTION_UNCOMMITTED, m_adapter.getCommittedDirection(2));
		assertEquals(IElevator.ELEVATOR_DIRECTION_UNCOMMITTED, m_adapter.getCommittedDirection(3));
		assertEquals(IElevator.ELEVATOR_DIRECTION_DOWN, m_adapter.getCommittedDirection(4));

        m_adapter.getCommittedDirection(5);
		
    }

    @Test
    public void testGetElevatorDoorStatus(){
    	assertEquals(IElevator.ELEVATOR_DOORS_OPEN, m_adapter.getElevatorDoorStatus(1));
		assertEquals(IElevator.ELEVATOR_DOORS_OPENING, m_adapter.getElevatorDoorStatus(2));
		assertEquals(IElevator.ELEVATOR_DOORS_CLOSED, m_adapter.getElevatorDoorStatus(3));
		assertEquals(IElevator.ELEVATOR_DOORS_CLOSING, m_adapter.getElevatorDoorStatus(4));
    	m_adapter.getElevatorDoorStatus(5);
		
    }
}
