/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
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
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        final int PRIMITIVA_MIN = 1;
        final int PRIMITIVA_MAX = 49;
        final int NUMERO_MARCAS = 6;

//bucle
        for (int i = 0; i < NUMERO_MARCAS; i++) {

//gENERA EL NUMERO
            int n = RND.nextInt(PRIMITIVA_MAX - PRIMITIVA_MIN + 1) + PRIMITIVA_MIN;

//MENSAJE DE SALIDA
            System.out.printf("numero %d ....: %d%n", i + 1, n);

        }

    }
}