package org.assertj.examples.data;

/**
 * {@link EmployeeOfTheMonth} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractEmployeeOfTheMonthAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class EmployeeOfTheMonthAssert extends AbstractEmployeeOfTheMonthAssert<EmployeeOfTheMonthAssert, EmployeeOfTheMonth> {

  /**
   * Creates a new <code>{@link EmployeeOfTheMonthAssert}</code> to make assertions on actual EmployeeOfTheMonth.
   * @param actual the EmployeeOfTheMonth we want to make assertions on.
   */
  public EmployeeOfTheMonthAssert(EmployeeOfTheMonth actual) {
    super(actual, EmployeeOfTheMonthAssert.class);
  }

  /**
   * An entry point for EmployeeOfTheMonthAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myEmployeeOfTheMonth)</code> and get specific assertion with code completion.
   * @param actual the EmployeeOfTheMonth we want to make assertions on.
   * @return a new <code>{@link EmployeeOfTheMonthAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static EmployeeOfTheMonthAssert assertThat(EmployeeOfTheMonth actual) {
    return new EmployeeOfTheMonthAssert(actual);
  }
}
