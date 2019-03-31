
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CalendarCode {

    public static int year;

    public static void addModel(JTable... table) {
        for (JTable table1 : table) {
            DefaultTableModel mod = new DefaultTableModel();
            table1.setModel(mod);
            mod.addColumn("Sun");
            mod.addColumn("Mon");
            mod.addColumn("Tue");
            mod.addColumn("Wed");
            mod.addColumn("Thu");
            mod.addColumn("Fri");
            mod.addColumn("Sat");
            mod.setRowCount(6);
        }
    }

    public static void createCalendar(JTable... table) {
        for (int i = 0; i < table.length; i++) {
            DefaultTableModel mod = (DefaultTableModel) table[i].getModel();
            mod.getDataVector().removeAllElements();
            mod.setRowCount(6);

            int month = i;
            int day = 1;
            Calendar cd = Calendar.getInstance();
            cd.set(year, month, day);
            int start = cd.get(cd.DAY_OF_WEEK);
            int maxDay = cd.getActualMaximum(cd.DAY_OF_MONTH);
            start--;
            int j = 0;
            for (int x = 1; x <= maxDay; x++) {
                mod.setValueAt(x, j, start);
                start++;
                if (start == 7) {
                    start = 0;
                    j++;
                }
            }

        }
    }
}
