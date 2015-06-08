/**
 * Copyright (C) 2014-2015 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.commons.id;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.compare.ESortOrder;

/**
 * Test class for class {@link ComparatorHasIDInteger}.
 *
 * @author Philip Helger
 */
public final class ComparatorHasIDIntegerTest
{
  @Test
  public void testAll ()
  {
    final List <? extends IHasID <Integer>> aList = CollectionHelper.newList (new MockHasIDInteger (5),
                                                                              new MockHasIDInteger (3),
                                                                              new MockHasIDInteger (7));
    CollectionHelper.getSortedInline (aList, new ComparatorHasIDInteger <IHasID <Integer>> ());
    assertEquals (3, aList.get (0).getID ().intValue ());
    assertEquals (5, aList.get (1).getID ().intValue ());
    assertEquals (7, aList.get (2).getID ().intValue ());

    CollectionHelper.getSortedInline (aList,
                                      new ComparatorHasIDInteger <IHasID <Integer>> ().setSortOrder (ESortOrder.ASCENDING));
    assertEquals (3, aList.get (0).getID ().intValue ());
    assertEquals (5, aList.get (1).getID ().intValue ());
    assertEquals (7, aList.get (2).getID ().intValue ());

    CollectionHelper.getSortedInline (aList,
                                      new ComparatorHasIDInteger <IHasID <Integer>> ().setSortOrder (ESortOrder.DESCENDING));
    assertEquals (7, aList.get (0).getID ().intValue ());
    assertEquals (5, aList.get (1).getID ().intValue ());
    assertEquals (3, aList.get (2).getID ().intValue ());
  }
}
