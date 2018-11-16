import static org.junit.jupiter.api.Assertions.*;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
class Problem1Test {

    private Problem1 problem1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        problem1 = new Problem1();
    }

    @org.junit.jupiter.api.Test
    void main1() {
        int result = problem1.problem1();

        assertEquals(12, result);
    }
}