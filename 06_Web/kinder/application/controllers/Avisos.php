<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Avisos extends CI_Controller{

  public function __construct()
  {
    parent::__construct();
    //Codeigniter : Write Less Do More
  }

  function index()
  {
    $array_avisos = array(
      "1" => "Aviso final de curso",
      "2" => "Reunión de padres",
      "3" => "Excursión parque"
    );

    $data = array(
      "username" => "Pepe",
      "avisos" => $array_avisos
    );

    $this->load->view('listado_avisos', $data);
  }

  function nuevo() {

    $this->load->view('nuevo_aviso');
  }

function editar() {

}

}
