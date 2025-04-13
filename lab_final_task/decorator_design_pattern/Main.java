package decorator_design_pattern;

// Decorator Interface Class
interface Dashboard {
    String displayWidget();
}

// Base Class
class BasicDashboard implements Dashboard {
    public String displayWidget() {
        return "Dashboard: Base";
    }
}

// Abstract Class
abstract class DashboardDecorator implements Dashboard {
    protected Dashboard dashboard;

    public DashboardDecorator(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    public String displayWidget() {
        return dashboard.displayWidget();
    }
}

// WeatherWidget Decorator
class WeatherWidget extends DashboardDecorator {
    public WeatherWidget(Dashboard dashboard) {
        super(dashboard);
    }

    public String displayWidget() {
        return super.displayWidget() + " + Weather";
    }
}

// NewsWidget Decorator
class NewsWidget extends DashboardDecorator {
    public NewsWidget(Dashboard dashboard) {
        super(dashboard);
    }

    public String displayWidget() {
        return super.displayWidget() + " + News Feed";
    }
}

// StockWidget Decorator
class StockWidget extends DashboardDecorator {
    public StockWidget(Dashboard dashboard) {
        super(dashboard);
    }

    public String showWidgets() {
        return super.displayWidget() + " + Stock Ticker";
    }
}

// CalendarWidget Decorator
class CalendarWidget extends DashboardDecorator {
    public CalendarWidget(Dashboard dashboard) {
        super(dashboard);
    }

    public String showWidgets() {
        return super.displayWidget() + " + Calendar";
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Dashboard dashboard = new BasicDashboard();
        dashboard = new WeatherWidget(dashboard);
        dashboard = new StockWidget(dashboard);

        System.out.println(dashboard.displayWidget());
    }
}
