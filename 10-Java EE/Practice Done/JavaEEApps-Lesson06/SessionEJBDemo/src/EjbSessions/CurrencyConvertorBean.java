package EjbSessions;

import javax.ejb.Stateless;

@Stateless(name = "EJBSessionBeans", mappedName = "JavaEEApps-Lesson06-SessionEJBDemo-EJBSessionBeans")
public class CurrencyConvertorBean implements CurrencyConvertor, CurrencyConvertorLocal {
    public CurrencyConvertorBean() {
    }
    public double dollarToRs(double dollars) {
            return 69.34 * dollars;
        }

     

        public double poundsToRs(Double pounds) {
            return 81.90 * pounds;
        }

     

        public double euroToRs(double euros) {
            return 76.12 * euros;
        }

     

        public double riyalsToRs(double riyals) {
            return riyals * 80;
        }

     

        public double yensToRs(double yens) {
            return yens * 20;
        }

     

        public double pesosToRs(double pesos) {
            return 0.34 * pesos;
        }
}
