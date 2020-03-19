package com.sample.postgress.service;

import com.sample.postgress.dao.TAccesAuxChainesDao;
import com.sample.postgress.entity.TAccesAuxChaines;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;


@Component
public class TAccesAuxChainesServiceImpl  implements TAccesAuxChainesService {

        @Resource
        TAccesAuxChainesDao taccesauxchainesDao;

        @Override
        public List<TAccesAuxChaines> findAll() {     return taccesauxchainesDao.findAll();        }

        @Override
        public void createTAccesAuxChaines(TAccesAuxChaines taccesauxchaines) {
            taccesauxchainesDao.createTAccesAuxChaines(taccesauxchaines);        }
/*
        @Override
        public void deleteUser(String TAccesAuxChainesId) {
            taccesauxchainesDao.deleteTAccesAuxChaines(TAccesAuxChainesId);
        }

        @Override
        public List<TAccesAuxChaines> FilteredTAccesAuxChaines(String TAccesAuxChainesId)  {  return taccesauxchainesDao.findFiltered(TAccesAuxChainesId) ;}


        @Override
        public void updateTAccesAuxChaines(TAccesAuxChaines taccesauxchaines) {
            taccesauxchainesDao.updateTAccesAuxChaines(taccesauxchaines);}

*/

    }
