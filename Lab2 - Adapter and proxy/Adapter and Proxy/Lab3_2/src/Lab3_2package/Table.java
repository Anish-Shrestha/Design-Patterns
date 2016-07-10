package Lab3_2package;


public class Table implements ITable{

    @Override
    public int numOfRows() {
        throw new UnsupportedOperationException("Not supported yet.");
          }

    @Override
    public IRow getRow(int rowNum) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void addRow(IRow row, int rowNum) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void modifyRow(int rowNum, IRow row) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void deleteRow(int rowNum) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
}
