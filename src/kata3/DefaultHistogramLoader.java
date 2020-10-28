package kata3;

import kata3.core.Histogram;
import kata3.core.HistogramLoader;

public class DefaultHistogramLoader implements HistogramLoader{

    private final String [] valores = new String [] {
    "Cadiz", "Barcelona", "Barcelona", "Madrid", "Barcelona", "Madrid", "Madrid", "Madrid", "Zaragoza"};
    
    @Override
    public Histogram load() {
        Histogram histogram = new Histogram();
        for (String valor : valores) {
            histogram.add(valor);
        }
        return histogram;
    }
    
}
