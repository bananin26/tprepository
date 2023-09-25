package pe.edu.upc.aww.takemehomes.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.takemehomes.repositories.IRecordRepository;
import pe.edu.upc.aww.takemehomes.serviceinterfaces.IRecordService;

import java.util.List;


@Service
public class RecordServiceImplement implements IRecordService {
    @Autowired
    private IRecordRepository iR;
    @Override
    public void insert(Record record) {
        iR.save(record);
    }
    @Override
    public List<Record> list() {
        return iR.findAll();
    }

    @Override
    public List<String[]> countPointsProduct() {
        return iR.countPointsProduct();
    }


}
