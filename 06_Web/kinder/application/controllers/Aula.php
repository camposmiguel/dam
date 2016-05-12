<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Aula extends CI_Controller {

	public function index()
	{
	}

  public function alumnos($aula) {
    		echo "Listado alumnos aulas del aula ".$aula;
  }




}
