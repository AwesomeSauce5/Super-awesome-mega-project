##JFreeChart
To get the chart working you will need to download JFreeChart from http://www.jfree.org/jfreechart/index.html. JCommons is already included with JFreeChart. The JARs are located jfreechart-1.0.19/lib/ and I would suggest copying jfreechart-1.0.19.jar and jcommon-1.0.23.jar to Documents or some other location, or just copying the whole library folder, but all we'll need is those two JARs as far as I know. There is also the source code for JFreeChart which is very interesting to look at.

##Install
In Eclipse right click the project and select preferences->Java Build Path->Libraries->Add External JARs and link Eclipse to jcommon-1.0.23.jar and jfreechart-1.0.19.jar. They should appear as referenced libraries in package explorer.
