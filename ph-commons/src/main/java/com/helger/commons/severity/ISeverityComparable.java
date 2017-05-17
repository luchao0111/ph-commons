/**
 * Copyright (C) 2014-2017 Philip Helger (www.helger.com)
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
package com.helger.commons.severity;

import javax.annotation.Nonnull;

/**
 * Interface for comparable objects based on their severity.
 *
 * @author Philip Helger
 * @param <THISTYPE>
 *        The implementation type
 */
public interface ISeverityComparable <THISTYPE extends ISeverityComparable <THISTYPE>>
{
  /**
   * Check if this object is of the same level (= equal important) than the
   * passed object.
   *
   * @param aOther
   *        The object to compare to.
   * @return <code>true</code> if this object is equally important than the
   *         passed object!
   * @deprecated Use {@link #isEQ(ISeverityComparable)} instead
   */
  @Deprecated
  default boolean isEqualSevereThan (@Nonnull final THISTYPE aOther)
  {
    return isEQ (aOther);
  }

  /**
   * Check if this object is of the same level (= equal important) than the
   * passed object.
   *
   * @param aOther
   *        The object to compare to.
   * @return <code>true</code> if this object is equally important than the
   *         passed object!
   */
  boolean isEQ (@Nonnull THISTYPE aOther);

  /**
   * Check if this object is of a different level (= different importance) than
   * the passed object.
   *
   * @param aOther
   *        The object to compare to.
   * @return <code>true</code> if this object is not equally important than the
   *         passed object!
   * @since 8.6.5
   */
  default boolean isNE (@Nonnull final THISTYPE aOther)
  {
    return !isEQ (aOther);
  }

  /**
   * Check if this object is of lower level (= less important) than the passed
   * object.
   *
   * @param aOther
   *        The object to compare to.
   * @return <code>true</code> if this object is less important than the passed
   *         object!
   * @deprecated Use {@link #isLT(ISeverityComparable)} instead
   */
  @Deprecated
  default boolean isLessSevereThan (@Nonnull final THISTYPE aOther)
  {
    return isLT (aOther);
  }

  /**
   * Check if this object is of lower level (= less important) than the passed
   * object.
   *
   * @param aOther
   *        The object to compare to.
   * @return <code>true</code> if this object is less important than the passed
   *         object!
   */
  boolean isLT (@Nonnull THISTYPE aOther);

  /**
   * Check if this object is of equal or lower level (= equally or less
   * important) than the passed object.
   *
   * @param aOther
   *        The object to compare to.
   * @return <code>true</code> if this object is equally or less important than
   *         the passed object!
   * @deprecated Use {@link #isLE(ISeverityComparable)} instead
   */
  @Deprecated
  default boolean isLessOrEqualSevereThan (@Nonnull final THISTYPE aOther)
  {
    return isLE (aOther);
  }

  /**
   * Check if this object is of equal or lower level (= equally or less
   * important) than the passed object.
   *
   * @param aOther
   *        The object to compare to.
   * @return <code>true</code> if this object is equally or less important than
   *         the passed object!
   */
  boolean isLE (@Nonnull THISTYPE aOther);

  /**
   * Check if this object is of higher level (= more important) than the passed
   * object.
   *
   * @param aOther
   *        The object to compare to.
   * @return <code>true</code> if this object is more important than the passed
   *         object!
   * @deprecated Use {@link #isGT(ISeverityComparable)} instead
   */
  @Deprecated
  default boolean isMoreSevereThan (@Nonnull final THISTYPE aOther)
  {
    return isGT (aOther);
  }

  /**
   * Check if this object is of higher level (= more important) than the passed
   * object.
   *
   * @param aOther
   *        The object to compare to.
   * @return <code>true</code> if this object is more important than the passed
   *         object!
   */
  boolean isGT (@Nonnull THISTYPE aOther);

  /**
   * Check if this object is of equal or higher level (= equally or more
   * important) than the passed object.
   *
   * @param aOther
   *        The object to compare to.
   * @return <code>true</code> if this object is equally or more important than
   *         the passed object!
   * @deprecated Use {@link #isGE(ISeverityComparable)} instead
   */
  @Deprecated
  default boolean isMoreOrEqualSevereThan (@Nonnull final THISTYPE aOther)
  {
    return isGE (aOther);
  }

  /**
   * Check if this object is of equal or higher level (= equally or more
   * important) than the passed object.
   *
   * @param aOther
   *        The object to compare to.
   * @return <code>true</code> if this object is equally or more important than
   *         the passed object!
   */
  boolean isGE (@Nonnull THISTYPE aOther);
}
