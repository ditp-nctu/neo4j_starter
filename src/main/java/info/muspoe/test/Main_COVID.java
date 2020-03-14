/*
 * Copyright 2020 Jonathan Chang, Chun-yien <ccy@musicapoetica.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package info.muspoe.test;

import info.muspoe.test.neo4j.COVID_19;

/**
 *
 * @author Jonathan Chang, Chun-yien <ccy@musicapoetica.org>
 */
public class Main_COVID {

    public static void main(String[] args) {
        try ( var covid = new COVID_19()) {
            covid.reset_graph();
            covid.create_graph(COVID_19.url);
        } catch (Exception ex) {
        }

    }

}
