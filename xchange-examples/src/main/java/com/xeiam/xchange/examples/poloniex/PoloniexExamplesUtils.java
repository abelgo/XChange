package com.xeiam.xchange.examples.poloniex;

import com.xeiam.xchange.Exchange;
import com.xeiam.xchange.ExchangeFactory;
import com.xeiam.xchange.ExchangeSpecification;
import com.xeiam.xchange.poloniex.PoloniexExchange;

/**
 * @author Zach Holmes
 */

public class PoloniexExamplesUtils {

  public static Exchange getExchange() {

    ExchangeSpecification spec = new ExchangeSpecification(PoloniexExchange.class);
    spec.setApiKey("42IUO88M-IQXQLMLE-SOL8H79Y-R8RK15VW");
    spec.setSecretKey("12b6aa0c12e80dd35901b0b67967a40bba7258cd9fb8c661a8b90a013fec82c0dffbed33b5facf68592bce322b54dd8166f19f6270eeeecc44518c9e92f1f80f");

    return ExchangeFactory.INSTANCE.createExchange(spec);
  }
}
