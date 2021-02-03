private final Collection stamps = ...;

        stamps.add(new Coin(...)); // "uncheckes call" 경고 발생

        for ( Iterator i = stamps.iterator(); i.hasNext();) {
        Stamp stamp = (Stamp) i.next(); //ClassCastException을 던진다.
        stamp.cancel();
        }