package org.example.issue101;

import java.util.List;
import java.util.Map;
public class FooConfig {
  private Map<String, List<CustomObject>> list;

  public Map<String, List<CustomObject>> getList() {
    return list;
  }

  public void setList(Map<String, List<CustomObject>> list) {
    this.list = list;
  }
}
