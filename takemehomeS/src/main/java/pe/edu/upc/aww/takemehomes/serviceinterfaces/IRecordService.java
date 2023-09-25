package pe.edu.upc.aww.takemehomes.serviceinterfaces;

import java.util.List;

public interface IRecordService {
    public void insert(Record record);
    public List<Record> list();
    public List<String[]>countPointsProduct();
}
