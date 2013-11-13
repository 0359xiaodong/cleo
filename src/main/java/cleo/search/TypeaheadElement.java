/*
 * Copyright (c) 2011 LinkedIn, Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package cleo.search;

import java.io.Serializable;

/**
 * TypeaheadElement
 * 
 * @author jwu
 * @since 02/05, 2011
 */
public interface TypeaheadElement extends Element, Serializable {
  
  public void setLine1(String line);
  
  public String getLine1();
  
  public void setLine2(String line);
  
  public String getLine2();
  
  public void setLine3(String line);
  
  public String getLine3();
  
  public void setMedia(String media);
  
  public String getMedia();
}