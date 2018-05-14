/*
 * Copyright 2018 org.LTR4L
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ltr4l.boosting;

public class OptimalLeafLoss {
  private int optimalFeature;
  private double minLoss;
  private double optimalThreshold;

  public OptimalLeafLoss( int optimalFeature, double optimalThreshold, double minLoss){
    this.optimalFeature = optimalFeature;
    this.optimalThreshold = optimalThreshold;
    this.minLoss = minLoss;
  }

  public int getOptimalFeature() {
    return optimalFeature;
  }

  public double getMinLoss() {
    return minLoss;
  }

  public double getOptimalThreshold() {
    return optimalThreshold;
  }

}
