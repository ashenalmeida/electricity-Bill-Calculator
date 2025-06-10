
package Class;

import javax.swing.table.DefaultTableModel;

public class NonEditableTableModel extends DefaultTableModel {
    
    public NonEditableTableModel (Object[] colomNames , int rowcount){
        super(colomNames , rowcount);
    }
     public boolean isCellEditable(int row, int column) {
        return false;
    }
}
