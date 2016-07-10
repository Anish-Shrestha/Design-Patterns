package Lab3_2package;


public class ProxyWithRowLock implements ITable {

    Table tReal;
    Integer[] locks;

    public ProxyWithRowLock(Table toBeLocked) {
    	tReal = toBeLocked;
        locks = new Integer[toBeLocked.numOfRows()];
        for (int row = 0; row < toBeLocked.numOfRows(); row++) {
            locks[row] = row;
        }
    }

    @Override
    public int numOfRows() {
        return tReal.numOfRows();
    }

    @Override
    public IRow getRow(int rowNum) {
        synchronized (locks[rowNum]) {
            return tReal.getRow(rowNum);
        }
    }

    @Override
    public void addRow(IRow row, int rowNum) {
        synchronized (locks[rowNum]) {
        	tReal.addRow(row, rowNum);
        }
    }

    @Override
    public void modifyRow(int rowNum, IRow row) {
        synchronized (locks[rowNum]) {
        	tReal.modifyRow(rowNum, row);
        }
    }

    @Override
    public void deleteRow(int rowNum) {
        synchronized (locks[rowNum]) {
        	tReal.deleteRow(rowNum);
        }
    }
}
