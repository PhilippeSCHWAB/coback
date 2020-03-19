package com.sample.postgress.service;

import com.sample.postgress.dao.TOutilDeTestDao;
import com.sample.postgress.entity.TOutilDeTest;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class TOutilDeTestServiceImpl {
}

/*
        @Resource
        TOutilDeTestDao toutilsdetestDao;
        @Override
        public List<TOutilDeTest> findAll() {     return toutilsdetestDao.findAll();        }
        @Override
        public void createTOutilDeTest(TOutilDeTest toutilsdetest) {
            toutilsdetestDao.createTOutilDeTest(toutilsdetest);        }

        @Override
        public void deleteOutilsDeTest(String OutilsDeTestUid) {
            toutilsdetestDao.deleteOutilsDeTest(OutilsDeTestUid);
        }

        @Override
        public List<TOutilDeTest> FilteredOutilsDeTest(String TOutilDeTestIud)  {  return toutilsdetestDao.findFiltered(TOutilDeTestIud) ;}


        @Override
        public void updateTOutilDeTest(TOutilDeTest toutilsdetest) {
            toutilsdetestDao.updateTOutilDeTest(toutilsdetest);}  }
*/
