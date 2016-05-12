<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Auth extends CI_Controller {

	public function index()
	{
		$this->load->view('welcome_message');
	}

  public function salir()
  {
    echo "Sesión cerrada";
  }


  public function entrar($username="default")
  {
    echo "Página de login, está intentando entrar con: ".$username;
  }
}
