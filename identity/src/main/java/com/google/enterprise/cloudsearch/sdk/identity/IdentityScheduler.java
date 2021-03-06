/*
 * Copyright © 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.enterprise.cloudsearch.sdk.identity;

import com.google.enterprise.cloudsearch.sdk.ConnectorScheduler;

/** Handles scheduling and execution of identity connector traversal related tasks. */
// TODO: This can probably remain a stub, since Identity connectors are unlikely to poll the queue.
public class IdentityScheduler extends ConnectorScheduler<IdentityConnectorContext> {

  private IdentityScheduler(Builder builder) {
    super(builder);
  }

  /** Builder for creating an instance of {@link IdentityScheduler} */
  public static class Builder extends AbstractBuilder<Builder, IdentityConnectorContext> {

    /** Returns this {@link IdentityScheduler.Builder} instance */
    @Override
    protected Builder getThis() {
      return this;
    }

    /** Builds an instance of {@link IdentityScheduler}. */
    @Override
    public IdentityScheduler build() {
      return new IdentityScheduler(this);
    }
  }
}
