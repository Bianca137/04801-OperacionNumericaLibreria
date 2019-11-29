/*
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
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
package org.japo.java.app;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import org.japo.java.libraries.UtilesEntrada;
import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public final class App {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final int N1;
    public static final int N2;

    static {
        final Random RND = new Random();

        final int NUM_MAX = 10;
        final int NUM_MIN = 1;

        N1 = RND.nextInt(NUM_MAX - NUM_MIN + 1) + NUM_MIN;
        N2 = RND.nextInt(NUM_MAX - NUM_MIN + 1) + NUM_MIN;

    }

    public final void launchApp() {

        System.out.println("OPERACION NUMERICA");
        System.out.println("==================");

        System.out.printf("Numero 1 ...:%d%n", N1);
        System.out.printf("Numero 2 ...:%d%n", N2);

        int n = (int) UtilesPrimitivos.operar(N1, N2, UtilesPrimitivos.OP_MAY);

        System.out.printf("EL mayor es....:%d%n", n);

    }

}
