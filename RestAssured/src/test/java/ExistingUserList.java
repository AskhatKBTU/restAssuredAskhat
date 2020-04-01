import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExistingUserList {
	
	public class Data implements Serializable {

		private List<String> columnNames = new ArrayList<String>();

		private List<ArrayList<String>> values = new ArrayList<ArrayList<String>>();

		public List<String> getColumnNames() {
		    return columnNames;
		}

		public void setColumnNames(List<String> columnNames) {
		    this.columnNames = columnNames;
		}

		public List<ArrayList<String>> getValues() {
		    return values;
		}

		public void setValues(List<ArrayList<String>> values) {
		    this.values = values;
		}

	}
}
