package de.lessvoid.nifty.loader.xpp3.elements;

import de.lessvoid.nifty.controls.Controller;
import de.lessvoid.nifty.elements.MethodInvoker;
import de.lessvoid.nifty.screen.ScreenController;

/**
 * OnClickType.
 * @author void
 */
public class OnClickType {
  /**
   * value.
   */
  private String value;

  /**
   * OnClickType.
   * @param valueParam value
   */
  public OnClickType(final String valueParam) {
    this.value = valueParam;
  }

  /**
   * check if the value is valid.
   * @return true when valid, false when not valid
   */
  public boolean isValid() {
    if (value == null) {
      return false;
    }

    return value.matches("\\w+\\((|\\w+(,\\s*\\w+)*)\\)");
  }

  /**
   * get method.
   * @param controlController controlController
   * @param screenController screenController
   * @return method
   */
  public MethodInvoker getMethod(
      final Controller controlController,
      final ScreenController screenController) {
    return new MethodInvoker(value, controlController, screenController);
  }
}