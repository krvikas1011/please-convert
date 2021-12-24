package com.pleaseconvert.model;

import java.util.List;

public interface ConversionCategory {
  String getName();

  List<Conversion> getConversions();
}
