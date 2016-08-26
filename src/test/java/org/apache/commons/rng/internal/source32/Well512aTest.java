/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.rng.internal.source32;

import org.junit.Assert;
import org.junit.Test;

public class Well512aTest {
    @Test
    public void testReferenceCode() {
        final Well512a rng = new Well512a(new int[] {
                740849862,  1202665156,  -199039369,  -259008301,  -291878969, -1164428990, -1565918811,   491009864,
                -1883086670,  1383450241,  1244617256,   689006653, -1576746370, -1307940314,  1421489086,  1742094000
            });

        final int[] refInt = {
            1634813289,   1876773016,   -973836208,  -2130023652,  -1045460084,  -1834384857,   1691032973,    609714289,
            2033920362,    555915483,      6680992,   1958127415,   1866469645,  -1471336965,   2049178762,   -192324811,
            -2056050066,    810879705,   1405046309,   -781317118,   1012782311,  -1045081032,    728377508,   1473511660,
            290489070,    326666761,   2018299979,  -1876688058,   1239968501,   1464625040,   2025151042,   -101397407,
            1387902041,    210959839,   1366359326,   -476473433,    153180037,  -1607631523,   -506743495,     17888738,
            313865008,   -340504498,    586684079,   1243699375,    753162229,   -646761694,   -739189655,   -210120185,
            -1856358726,   -628255542,  -1812798197,   1416288088,   1077967722,   -846846208,   1379850409,   -580183344,
            -1858959,    210859778,    295841424,   1492774865,  -1415543680,   -344870570,  -1942779197,   1549510646,
            -389544849,    314254218,     11784988,  -1311757368,   1719514841,   -764610517,   1296788970,   -994707050,
            783854563,    422654144,    387639079,   1219688425,   2144352572,   -834212874,  -1036550358,    935909479,
            -568610842,   1327498837,   -588933178,   1910065754,    -40851599,   -182063170,   1302731458,    541311559,
            -1647345522,    805224371,  -1721196679,   1518507830,   -952689880,   -433276260,    509675254,   -777259954,
            1277810106,    284054896,    936042202,   2036836351,   1956412426,  -1186403024,    287795400,   2135311211,
            720485927,   1500695024,   -281656583,  -1277937322,  -1628968482,   1242814831,  -2030700974,   1473867890,
            440813549,  -1357033971,     28384076,   1602731216,   -641465746,   -609054347,    635938444,   1472898176,
            1476894555,   -747974186,  -1590337055,   -884242108,   -389736197,  -2066984505,   1087103272,  -1236446290,
            31657463,   1835715432,   -468439078,  -2132633204,   -434609235,    258308151,   1851926761,  -1630139159,
            -1344617241,   1969204215,    619463174,   -174392624,    207475487,  -1619828078,   1327980298,    -83968178,
            445951782,  -1786230541,      6279288,   -580982231,   1550645552,   2006533941,    275746007,    455676647,
            2019637349,   1115547704,  -1313120106,   -516213449,     73752461,  -1382448112,    398589620,   1319888048,
            -1595572334,   1566934536,  -1735685764,  -1509545339,   1458173912,   -549395819,   -618827040,   1516624531,
            1900757187,  -1454200688,    965524719,    488355065,  -1869294316,   -810641680,  -2059428251,   1454656431,
            1329120541,   -232185900,   -994996943,   1855980910,   -452077812,   1565630611,    759842266,   1241435187,
            -1390456063,   1946400597,  -2032319771,    683667881,    905911106,   1983310786,    120010546,    526018017,
            -1946881912,    205004987,  -1307250612,   2130980818,   2052864161,    189839787,   1789478047,    406168885,
            -1145186347,      8507675,   1277188815,   1492619042,   2009819675,  -1627411598,   -851016743,  -1828234956,
            1962622506,   2140398255,    236935165,   -337237772,   1263419111,    516775236,   -335741025,   1391328225,
            455979249,  -1457534664,   -657606241,    485648133,   1762116343,   1194889600,    817834937,    321150162,
            131159182,    290277758,  -1876924740,  -1770401129,   1291602973,  -1003642974,  -1580211929,   1520422021,
            -399171579,    -24315308,    453805396,   -659197747,   -205656847,    466526550,   1444397201,   1178091401,
            -1157268826,   -602394028,  -1370668795,   1614896435,   1699071659,   1864753793,   1888518358,  -1721244514,
            1812776767,    668822227,   -297283057,   2130183333,  -1169618692,    912860240,  -2028253096,   1244694278
        };

        for (int i = 0; i < refInt.length; ++i) {
            Assert.assertEquals(refInt[i], rng.nextInt());
        }
    }
    
    public static void main(String[] args){
    	Well512aTest test = new Well512aTest();
    	test.testReferenceCode();
    }
}
